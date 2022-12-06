package khanzapengenkripsiteks;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import org.apache.poi.hssf.record.formula.functions.Len;
import org.apache.poi.hssf.record.formula.functions.Mid;
import uz.ncipro.calendar.JDateTimePicker;

/**
 *
 * @author Owner
 */
public final class sekuel {
    private static String dicari = "", inputan = "";
    private static Integer Panjang_Input, panjangKey;
    private static int angka = 0;
    private static char enkrip;

    public sekuel() {
        super();
    }
    
    public static String decXML(String input, String k) {
        dicari = "";
        try {
            inputan = input;
            Panjang_Input = inputan.length();
            panjangKey = k.length();
            for (int i = 0; i < Panjang_Input; i++) {
                angka = inputan.charAt(i);
                angka = (angka - panjangKey) + 10;
                enkrip = (char) angka;
                dicari = dicari + enkrip;
            }

        } catch (Exception e) {
            System.out.println("Notifikasi : " + e);
        }
        return dicari;
    }
    
    public static String encXML(String input, String k) {
        dicari = "";
        try {
            inputan = input;
            Panjang_Input = inputan.length();
            panjangKey = k.length();
            for (int i = 0; i < Panjang_Input; i++) {
                angka = inputan.charAt(i);
                angka = (angka + panjangKey) - 10;
                enkrip = (char) angka;
                dicari = dicari + enkrip;
            }

        } catch (Exception e) {
            System.out.println("Notifikasi : " + e);
        }
        return dicari;
    }
}
