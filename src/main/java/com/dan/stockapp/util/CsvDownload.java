package com.dan.stockapp.util;
import org.springframework.stereotype.Component;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
/**
 * Created By Dan on 2017/10/27
 */
@Component
public class CsvDownload {

    public double getPrice(String stockName) {
        String[] b = new String[3];
        try {
            URL url = new URL("http://download.finance.yahoo.com/d/quotes.csv?s=" + stockName + "&f=nl1");
            URLConnection uc = url.openConnection();
            InputStreamReader inStream = new InputStreamReader(uc.getInputStream());
            BufferedReader buff= new BufferedReader(inStream);

            String content2 = null;

            BufferedWriter bf = new BufferedWriter(new FileWriter("stock.csv"));
            while ((content2 = buff.readLine()) != null) {

                bf.write(content2);
                bf.newLine();
                bf.flush();
            }

            bf.close();

            String splitBy = ",";
            FileReader file = new FileReader("stock.csv");
            BufferedReader buf = new BufferedReader(file);
            String line = buf.readLine();
            if(line != null) {
                b = line.split(splitBy);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(b != null) {
            return Double.parseDouble(b[2]);
        }

        return 0;
    }


}
