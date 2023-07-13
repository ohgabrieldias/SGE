/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;


import static com.mysql.cj.conf.PropertyKey.logger;
import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabriel
 */
public class Formater {
    Logger logger = Logger.getLogger(getClass().getName());
    private static final String DATE_FORMAT = "yyyy-MM-dd";
    
    public static String formatarData(String dataString) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data = sdf.parse(dataString);
        return new SimpleDateFormat(DATE_FORMAT).format(data);
    }
    

// ...

    public static String formatarData2(JDateChooser dateChooser) {
        Date dataSelecionada = dateChooser.getDate();

        if (dataSelecionada != null) {
            SimpleDateFormat formatador = new SimpleDateFormat(DATE_FORMAT);
            return formatador.format(dataSelecionada);
        } else {
            return null;
        }
    }
    
    public static Date converteStringToDate(String dateString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        try {
            return dateFormat.parse(dateString);
        } catch (ParseException e) {
            Logger.getLogger(Formater.class.getName()).log(Level.SEVERE, "Erro ao converter o formato de data" );
            return null;
        }
    }

}
