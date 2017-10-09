/*
 * Copyright 2017 Lassaad 
 */
package uscis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.omg.CORBA.NameValuePair;
import sun.net.www.http.HttpClient;


/**
 *
 * @author lassaad
 */
public class Uscis {

    /**
     * @param args the command line arguments
     */
    private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; WOW64)AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.1916.114 Safari/537.36";
    //private static final String GET_URL = "http://localhost:9090/SpringMVCExample";
    private static final String POST_URL = "https://egov.uscis.gov/casestatus/mycasestatus.do";
    private static final String POST_PARAMS = "userName=Pankaj";
    
    
    //
    
    private static void sendPOST() throws IOException {
            String caseNumber = "EAC1717351935";
            String data = "{'appReceiptNum': "+ caseNumber +",'changeLocale': '','completedActionsCurrentPage': '0','upcomingActionsCurrentPage':'0','caseStatusSearchBtn':'CHECK STATUS'}";
            String type = "application/x-www-form-urlencoded";
            String encodedData = URLEncoder.encode( data ); 
            
            
    //DDDD
            
       // URL u = new URL("https://egov.uscis.gov/casestatus/mycasestatus.do");
       // HttpURLConnection conn = (HttpURLConnection) u.openConnection();
        //conn.setDoOutput(true);
        //conn.setRequestMethod("POST");
       // conn.setRequestProperty( "Content-Type", type );
       // conn.setRequestProperty( "Content-Length", String.valueOf(encodedData.length()));
        //OutputStream os = conn.getOutputStream();
        //System.out.println("11--: "+ os);
        //os.write(encodedData.getBytes());
        
        //String headers = 
                   // "{"Content-type": "application/x-www-form-urlencoded","
                   // + ""Refer": "https://egov.uscis.gov/casestatus/landing.do",
                   // "Origin":"https://egov.uscis.gov",
                   // "Upgrade-Insecure-Requests":"1",
                   // "Accept": """text/html,
                               //     application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8""",
                                    //"User-Agent": """Mozilla/5.0 (Windows NT 6.1; WOW64)
                                   // AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.1916.114 Safari/537.36"""}
            //DDD
            URL obj = new URL(POST_URL);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("User-Agent", USER_AGENT);
            con.setRequestProperty( "Content-Type", type );
            con.setRequestProperty( "Refer", "https://egov.uscis.gov/casestatus/landing.do" );
            con.setRequestProperty( "Origin", "https://egov.uscis.gov" );
            con.setRequestProperty( "Upgrade-Insecure-Requests", "1" );
            con.setRequestProperty( "Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp;q=0.8" );
            con.setRequestProperty( "Content-Length", String.valueOf(encodedData.length()));
            // For POST only - START
            con.setDoOutput(true);
            OutputStream os = con.getOutputStream();
            os.write(encodedData.getBytes());
            os.flush();
            os.close();
            // For POST only - END

            int responseCode = con.getResponseCode();
            
            
            System.out.println("POST Response Code :: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) { //success
                    BufferedReader in = new BufferedReader(new InputStreamReader(
                                    con.getInputStream()));
                    String inputLine;
                    StringBuffer response = new StringBuffer();
                    

                    while ((inputLine = in.readLine()) != null) {
                            response.append(inputLine);
                    }
                    
                     
                    in.close();

                    // print result
                    //System.out.println(response.toString());
                    //Pattern p = Pattern.compile(response.toString());
                    //Matcher m = p.matcher("as");
                    
                    //Matcher m =  p.matcher(".*Your Current Status:</strong>\s*(?P<prog>[^<]+?)\s*<span.*");
                    //Matcher m =  p.matcher(".*Your Current Status:</strong>");
                    
                    
                   

                    //return htmlparser.unescape(r.groupdict().get("prog")).strip() if (r and r.groupdict()) else None ;
                    
            
            } else {
                    System.out.println("POST request not worked");
            }
    }


    
    //Fees Were Waived 
    //On February 7, 2017, we received your case and waived the filing fee for your
    //Form I-192, 
    //Application for Permission to Enter as Nonimmigrant, Receipt Number EAC1710450146. We mailed you a notice describing how we will process your case. Please follow the instructions in the notice. If you do not receive your receipt notice by March 9, 2017, please call Customer Service at 1-800-375-5283. If you move, go to www.uscis.gov/addresschange to give us your new mailing address
    
    
    
    
    //333
    public static void main(String[] args) throws  IOException {
        // TODO code application logic here
        
        //sendPOST();
	System.out.println("POST DONE");
        String caseNumber; //= "EAC1717351935";
        NumberFormat nf = new DecimalFormat("0000");
        for(int i =0 ; i < 2000; i++){
            
            // EAC     17 104 5 1991  
            caseNumber = "EAC171045"+ nf.format(i);
            
            String url = "https://egov.uscis.gov/casestatus/mycasestatus.do?appReceiptNum="+caseNumber;
            Document document = Jsoup.connect(url).get();

            String question = document.select(".rows").text();
            String[] ops = question.split("\\.");
            
            if(ops.length> 0){
                if(ops[0].contains("Form I-129")){
                    if(!ops[0].contains("Case Was Approved")){
                        if( !ops[0].contains("Withdrawal Acknowledgement Notice")){
                            if(!ops[0].contains("Decision Notice Mailed")){
                                System.out.println("case " + caseNumber +" "+ ops[0]);
                            }
                        }
                        
                    }
                }
                
            }
        }
        
        //1710451991

        
        /*Connection.Response response = Jsoup.connect("https://egov.uscis.gov/casestatus/mycasestatus.do")
        .data("text", "value")
        .data("appReceiptNum", "EAC1717351935")
        .data("appReceiptNum", "EAC1717351930")
        .userAgent("Mozilla")
        .method(Method.POST)
        .execute();
        System.out.println("Ress: " + response.body().matches("."));
        
        */
  //      String caseNumber = "EAC1717351935";
//                    String data3 = "{'appReceiptNum': "+ caseNumber +",'changeLocale': '','completedActionsCurrentPage': '0','upcomingActionsCurrentPage':'0','caseStatusSearchBtn':'CHECK STATUS'}";

   //    Connection.Response res1 = Jsoup.connect("https://egov.uscis.gov/casestatus/mycasestatus.do")
//.userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:25.0) Gecko/20100101     Firefox/25.0")
//.header("Content-Type", "multipart/form-data")
//.followRedirects(false)
//.referrer("https://egov.uscis.gov/casestatus/mycasestatus.do")
//.data("appReceiptNum", "EAC1717351935")
//.data("appReceiptNum", "EAC1717351930")
//.method(Method.POST).execute();
       
       
  //      System.out.println("Question: " + res1.body());
       /*
       
        con.setRequestMethod("POST");
            con.setRequestProperty("User-Agent", USER_AGENT);
            con.setRequestProperty( "Content-Type", type );
            con.setRequestProperty( "Refer", "https://egov.uscis.gov/casestatus/landing.do" );
            con.setRequestProperty( "Origin", "https://egov.uscis.gov" );
            con.setRequestProperty( "Upgrade-Insecure-Requests", "1" );
            con.setRequestProperty( "Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp;q=0.8" );
            con.setRequestProperty( "Content-Length", String.valueOf(encodedData.length()));
       */
       
        //String question = document.select("h1").text();
        //System.out.println("Question: " + question);

        
       // Elements answerers = document.select("p");
       // for (Element answerer : answerers) {
       //     System.out.println("Answerer: " + answerer.text());
       // }
        
        //String caseNumber = "EAC1717351935";
        //String data = "{'appReceiptNum': "+ caseNumber +",'changeLocale': '','completedActionsCurrentPage': '0','upcomingActionsCurrentPage':'0','caseStatusSearchBtn':'CHECK STATUS'}";
       /*
        String type = "application/x-www-form-urlencoded";
        String encodedData = URLEncoder.encode( data ); 
        URL u = new URL("https://egov.uscis.gov/casestatus/mycasestatus.do");
        HttpURLConnection conn = (HttpURLConnection) u.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        conn.setRequestProperty( "Content-Type", type );
        conn.setRequestProperty( "Content-Length", String.valueOf(encodedData.length()));
        OutputStream os = conn.getOutputStream();
        System.out.println("11--: "+ os);
        os.write(encodedData.getBytes());
        
        System.out.println("__--: "+ conn.getResponseMessage());
        System.out.println("__s-: "+ conn.getResponseCode());
                System.out.println("__s-: "+ conn);

        */
        
    }
    
}
