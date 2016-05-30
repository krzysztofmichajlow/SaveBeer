package fallen.example.wampirek.savebeer1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.app.Activity;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

import java.io.FileOutputStream;
import java.io.IOException;

public class newbeer extends Activity {
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(fallen.example.wampirek.savebeer.R.layout.activity_newbeer);
        image = (ImageView) findViewById(fallen.example.wampirek.savebeer.R.id.imageView);
    }

    public void makeafoto(View view) {
Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bitmap = (Bitmap) data.getExtras().get("data");
        image.setImageBitmap(bitmap);
    }
    public void saveBeer(View view, Bitmap bmp) throws IOException {
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("newBeer");;
            bmp.compress(Bitmap.CompressFormat.PNG, 100, out);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
