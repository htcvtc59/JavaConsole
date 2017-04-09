package NestedClass;

/**
 * Created by Monkey.TNT on 11/1/2016.
 */
class Server {
    String port;
    public void connectServer(String IP, String port){
        System.out.println("Connnecting to Server at "+IP+": "+port);
    }
    class IPAddress{
        String getIP(){
            return "101.232.28.12";
        }
    }
}

class TestConnnecting {
        public static void main (String[]args){
            if (true) {
                Server objServer1 = new Server();
                Server.IPAddress objIP = objServer1.new IPAddress();
                objServer1.connectServer(objIP.getIP(),"8080");
            } else {
                System.out.println("Usage: java Server <port-no>");
            }
        }
    }

