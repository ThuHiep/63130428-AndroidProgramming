package ntu.dtthiep.vidutaodatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*SQLiteDatabase db = openOrCreateDatabase(
                "QuanLySach.db"//ten
                ,MODE_PRIVATE//gioi han
                ,null
                );
        // B1. Tạo bảng
        // câu lênh tạo bảng
        String sqlXoaBangNeuDaCo="DROP TABLE IF EXISTS Books;";

        String sqlTaoBang = "CREATE TABLE Books( BookID integer PRIMARY KEY, " +
                "BookName text, " +
                "Page integer, " +
                "Price Float, " +
                "Description text);";
        // thực hiện lệnh sql
        db.execSQL(sqlXoaBangNeuDaCo);
        db.execSQL(sqlTaoBang);
        // Ta đóng lại để check
        // Thêm một số dòng dữ liệu vào bảng
        String sqlThem1 = "INSERT INTO BOOKS VALUES(1, 'Không diệt không sinh đừng sợ hãi', 100, 9.99, 'Nỗi khổ lớn nhất của chúng ta là ý niệm đến-đi, lui-tới\n" +
                "java');";
        String sqlThem2 = "INSERT INTO BOOKS VALUES(2, 'Dạy con làm giàu', 320, 19.00, 'Hướng dẫn về tư duy tài chính và đầu tư thông qua câu chuyện về cuộc sống của tác giả với hai người cha, một giàu và một nghèo.\n" +
                "bản');";
        String sqlThem3 = "INSERT INTO BOOKS VALUES(3, 'Sapiens', 120, 0.99, 'Tóm tắt lịch sử phát triển của loài người từ thời tiền sử đến thời hiện đại, với những nhận định sâu sắc về văn hóa, xã hội và khoa học.\n" +
                "cho vui');";
        String sqlThem4 = "INSERT INTO BOOKS VALUES(4, '1984', 1000, 29.50, ' Một tác phẩm về xã hội tương lai tối tăm, nơi chính phủ theo dõi mọi hành vi của công dân và kiểm soát thông tin thông qua chính quyền tuyệt đối.\n" +
                "điển 100.000 từ');";
        String sqlThem5 = "INSERT INTO BOOKS VALUES(5, 'The Great Gatsby', 1, 1, 'Một câu chuyện về tình yêu, lòng tham và sự khao khát của con người trong cuộc sống xa hoa và sôi động của thập niên 1920.');";
        db.execSQL(sqlThem1);
        db.execSQL(sqlThem2);
        db.execSQL(sqlThem3);
        db.execSQL(sqlThem4);
        db.execSQL(sqlThem5);
        db.close();*/

        //Truy vấn select
        //B1: Mở csld
        SQLiteDatabase db = openOrCreateDatabase("QuanLySach.db", // tên file = tên DB
                MODE_PRIVATE,  // giới hạn truy cập
                null          // con trỏ bản ghi
        );
        //B2: Thực thi câu lệnh select
        String sqlSelect ="Select * from Books;";
        Cursor cs = db.rawQuery(sqlSelect,null);
        cs.moveToFirst(); // đưa con trỏ bản ghi về hàng đầu tiên

    }
}