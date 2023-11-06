package Serveur;
import Service.CalculWS;
import Service.CalculatriceWS;
import sun.rmi.transport.Endpoint;
		public class ServeurJWS {
		    public static void main(String[] args) {

		        CalculatriceWS calculatrice =new CalculatriceWS();
		        String url ="http://localhost:8084/";
		        Endpoint.publish(url, calculatrice);
		        System.out.println("Server url:"+ url);

		    }
		}
