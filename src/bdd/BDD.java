package bdd;

import java.sql.*; // Inclue toute les importations SQL (PreparedStatement, Connection...)
import java.util.ArrayList;


public class BDD {

    protected Connection connection = null; 
    /* Le type protected permet d'utiliser le membre dans les classe qui sont hérité de BDD */
    private Statement statement = null;
    private ResultSet resultSet = null;
    private final PreparedStatement insertSet= null;


    // Méthode de connexion à la base de donnée
    public boolean Connexion() {
        
        try { // le try effectue un test pour un bloc de code dans le but de détecter les exceptions
              // le catch présent dans les blocs try permet d'intercepter les exceptions qui peuvent être levées 
            //Chargement du driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            String url = "jdbc:mysql://127.0.0.1/smartshopping";
            String username = "smartshopping_user";
            String password = "@123+aze$";


            // Vérification des identifiants
            if (url==null|| username==null || password==null){
                System.err.println("Les informations de connexion à la base de données sont manquantes. Vérifiez vos variables d'environnement.");
                // System.err.println est principalement utilisé pour affichés les erreurs dans une console. Peut-être affiché en rouge 
                return false;
            }

            connection = DriverManager.getConnection(url,username,password); //Connexion à la base 
            return true;
            } catch (ClassNotFoundException e) {//s'éxécute si le driver n'est pas trouver notamment dans ce cas JDBC
                System.err.println("Driver JDBC non trouvé : " + e.getMessage());
                return false;
            } catch (SQLException e) { // SQLException éxecute toutes les erreurs liées à la base de donnée
                System.err.println("Erreur de connexion à la base de données : " + e.getMessage());
                return false;
            } catch (Exception e) { //prend en compte toutes autres erreurs prévu 
                System.err.println("Erreur inconnue : " + e.getMessage());
                return false;
            }
    }
    

    // Méthode de fermeture de la connexion apès chaque utilisation
    public void closeConnection() {
        try { 
            if (connection != null) { //Si la connexion est null
                connection.close(); // la connexion ce ferme
            }
        } catch (SQLException e) { 
            e.printStackTrace();
        }
    }

    // Convertie les résultats de la requête (ResultSet) en un tableau d'objet
    ArrayList<ArrayList<Object>> tabReturn = new ArrayList<>();  
    protected ArrayList<ArrayList<Object>> getResultTableau(ResultSet resultSet) throws SQLException { 
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount(); // Les deux lignes permettent de récupérer les metadonnées

        while (resultSet.next()){ //resultSet.next déplace le curseur sur la ligne suivante
            ArrayList<Object> ligne = new ArrayList<>(); // C'est une liste temporaire ou les données de chaques colonnes y sont ajoutés. 
            for (int i = 1 ; i<= columnCount; i++) {
                ligne.add(resultSet.getObject(i)); // ajout de la colonne à l'ArrayList list 
            }
            tabReturn.add(ligne); // chaque ligne est ensuite ajouté au tableau 
        }
        return tabReturn;
    }




    // Méthode qui permet d'effectuer des requêtes INSERT,UPDATE, DELETE sur la base de données. 
    public boolean executeUpdate(String requete, Object... params) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(requete)) {
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Méthode qui permet d'effectuer des requêtes SELECT dans la base de données
    public ArrayList<ArrayList<Object>> executeQuery(String query, Object... params) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                return getResultTableau(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
