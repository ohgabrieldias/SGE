/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author gabriel
 */
public class Formater {
    
    public static String formatarData(String dataString) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data = sdf.parse(dataString);
        return new SimpleDateFormat("yyyy-MM-dd").format(data);
    }
    

// ...

    public static String formatarData2(JDateChooser dateChooser) {
    Date dataSelecionada = dateChooser.getDate();

    if (dataSelecionada != null) {
        SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");
        return formatador.format(dataSelecionada);
    } else {
        return null;
    }
}

}
