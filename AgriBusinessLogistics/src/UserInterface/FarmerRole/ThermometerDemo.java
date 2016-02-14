/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FarmerRole;

import java.awt.Color;
import java.awt.GridLayout;
import static javafx.scene.input.KeyCode.H;
import static javafx.scene.input.KeyCode.W;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.data.general.DefaultValueDataset;

/**
 *
 * @author user
 */
public class ThermometerDemo extends JPanel {
    private static final int W = 200;
    private static final int H = 2 * W;
    
    public ThermometerDemo(double value, String type) {
        this.setLayout(new GridLayout());
        DefaultValueDataset dataset = new DefaultValueDataset(value);
        if(type.equals("high")){
        ThermometerPlot plot = new ThermometerPlot(dataset);
            plot.setSubrangePaint(0, Color.green.darker());
            plot.setSubrangePaint(1, Color.ORANGE);
            plot.setSubrangePaint(2, Color.RED.darker());
        
            plot.setSubrangeInfo(0, 10, 28, 30, 60);
        
            JFreeChart chart = new JFreeChart("Cold Storage", JFreeChart.DEFAULT_TITLE_FONT, plot, true);
            this.add(new ChartPanel(chart, W, H, W, H, W, H, false, true, true, true, true, true));
        }
        else if(type.equals("medium")){
            ThermometerPlot plot = new ThermometerPlot(dataset);
            plot.setSubrangePaint(0, Color.green.darker());
            plot.setSubrangePaint(1, Color.ORANGE);
            plot.setSubrangePaint(2, Color.RED.darker());
        
            plot.setSubrangeInfo(0, 12, 14, 30, 60);
        
            JFreeChart chart = new JFreeChart("Medium Storage", JFreeChart.DEFAULT_TITLE_FONT, plot, true);
            this.add(new ChartPanel(chart, W, H, W, H, W, H, false, true, true, true, true, true));
        }
        else {
            ThermometerPlot plot = new ThermometerPlot(dataset);
            plot.setSubrangePaint(0, Color.green.darker());
            plot.setSubrangePaint(1, Color.YELLOW);
            plot.setSubrangePaint(2, Color.RED.darker());
        
            plot.setSubrangeInfo(0, 20, 35, 46, 60);
        
            JFreeChart chart = new JFreeChart("Warm Storage", JFreeChart.DEFAULT_TITLE_FONT, plot, true);
            this.add(new ChartPanel(chart, W, H, W, H, W, H, false, true, true, true, true, true));
        }
    }
}
