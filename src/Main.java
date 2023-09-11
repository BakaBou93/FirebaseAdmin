import java.io.FileInputStream;
import java.io.IOException;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream serviceAccount = new FileInputStream("./push-notifications-3c140-f40e8cfb60d4.json");

        GoogleCredentials googleCredentials = GoogleCredentials.fromStream(serviceAccount);

        System.out.println(googleCredentials.getAccessToken());

//        FirebaseOptions options = FirebaseOptions.builder()
//                .setCredentials(googleCredentials)
//                .build();
//
//        FirebaseApp firebaseApp = FirebaseApp.initializeApp(options);
//
//        System.out.println(firebaseApp.getName());
    }
}