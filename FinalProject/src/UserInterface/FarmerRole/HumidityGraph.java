/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FarmerRole;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.data.general.DefaultValueDataset;

/**
 *
 * @author user
 */
public class HumidityGraph extends JPanel {
private static final int W = 200;
    private static final int H = 2 * W;
    private JFreeChart meterChart;
    private MeterPlot meterPlot; 
    private ChartPanel panelMeter;
    DefaultValueDataset data ;
    //int value = 26;
    public HumidityGraph(double value, String type) {
        
       data = new DefaultValueDataset(value);
        final JFrame frame = new JFrame();
        meterPlot = new MeterPlot(data);
        frame.getContentPane().setLayout(new BorderLayout(5, 5));
        frame.setDefaultCloseOperation(3);
        frame.setTitle("Inventory Humidity");
        meterChart = new JFreeChart("Humidity Chart", JFreeChart.DEFAULT_TITLE_FONT, this.meterPlot, false);
        panelMeter = new ChartPanel(this.meterChart);
        frame.getContentPane().add(panelMeter, BorderLayout.CENTER);
        frame.setSize(700, 400);
        final Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((d.width - frame.getSize().width) / 2,
                      (d.height - frame.getSize().height) / 2);
        frame.setVisible(true);
        
    
    }
    

}
