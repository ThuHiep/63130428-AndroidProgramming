package ex.three.SimpleSumApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//Bộ lắng nghe và xử lý sự kiện click lên button tinh tổng
    public void xulycong(View view) {
        // Tìm tham chiếu đến điều khiển trên XML, mapping sang java file
        EditText editTextSoa = findViewById(R.id.edta);
        EditText editTextSob = findViewById(R.id.edtb);
        EditText editTextKq = findViewById(R.id.edtkq);
        //Lấy dữ liệu về ở điều khiển số a,b
        String stra =  editTextSoa.getText().toString();
        String strb = editTextSob.getText().toString();

        //chuyển dữ liệu sang dạng số
         int so_a =  Integer.parseInt(stra);
         int so_b = Integer.parseInt(strb);
        //Tính toán
        int sum = so_a+so_b;
        String strtong = String.valueOf(sum);//chuyển sang dạng chuỗi
        //Hiện ra màn hình
        editTextKq.setText(strtong);

    }
}