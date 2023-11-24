package com.example;

import java.util.ArrayList;
import java.util.List;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<JenisMetric> jenisMetricList = new ArrayList<JenisMetric>();

        JenisMetric metric1 = new JenisMetric("Metric A", "Keterangan A");
        JenisMetric metric2 = new JenisMetric(1, "001", "Metric B", "Keterangan B");
        JenisMetric metric3 = new JenisMetric("002", "Metric C", "Keterangan C");
        JenisMetric metric4 = new JenisMetric(2);
        JenisMetric metric5 = new JenisMetric("Metric D", "Keterangan D");
        JenisMetric metric6 = new JenisMetric(3, "003", "Metric E", "Keterangan E");
        JenisMetric metric7 = new JenisMetric("004", "Metric F", "Keterangan F");
        JenisMetric metric8 = new JenisMetric(4);
        JenisMetric metric9 = new JenisMetric("Metric G", "Keterangan G");
        JenisMetric metric10 = new JenisMetric(5, "005", "Metric H", "Keterangan H");
    }
}
