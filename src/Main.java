import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import com.sun.media.rtsp.Timer;

public class Main {

        String statueOne = "https://skfb.ly/Nzwp";
        
        public static void main(String[] args){
                String statueOne = "https://skfb.ly/Nzwp";

                
                try {
                        Desktop.getDesktop().open(new File("scene.mp4"));
                        
                        TimeUnit.SECONDS.sleep(14);
                        
                        Desktop.getDesktop().browse(new URI(statueOne));
                        
                } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                } catch (URISyntaxException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }

        }
        
}
