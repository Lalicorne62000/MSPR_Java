package Controllers;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Agents{
    
    public  void  generate_header_page(Object ficher_agent , String path_output , String name_div , int number) throws IOException {

        
        BufferedWriter writer = new BufferedWriter(new FileWriter(path_output, true ));
       if (name_div =="poste")
       {
        writer.write("<h2> Poste : </h2> <div Class="+name_div+"> <h"+number+">"+ficher_agent+"</h"+number+"> </div> <h2> Liste du matériel pris  : </h2> ");
       }
       else
        {
            writer.write("<div Class="+name_div+"> <h"+number+">"+ficher_agent+"</h"+number+"> </div> ");
        }
       
        
       
       writer.flush();
       writer.close();
        
    }
    
    
    }

    

