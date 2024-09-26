package com.example;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;

import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

// // отображение точек на графике
// import org.jfree.chart.plot.XYPlot;
// import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

import javax.swing.*;

public class ChartExample extends JFrame {
   
    public static ChartPanel createChartPanel() {
        // создание серии данных
        XYSeries series = new XYSeries("sin(x)");
        for (double x = 0; x <= 2 * Math.PI; x += 0.1) {
            series.add(x, Math.sin(x));
        }

        XYSeriesCollection dataset = new XYSeriesCollection(series); // класс данных для графика

        JFreeChart chart = ChartFactory.createXYLineChart( // создание линейного графика
                "Sine Function", // название графика
                "X", // подпись горизонтальной оси 
                "Y", // подпись вертикальной оси
                dataset, // набор данных
                PlotOrientation.VERTICAL, // ориентация графика
                true, true, false); // отображение легенды, подсказок, url-адрессов

        // // отображение точек на графике
        // XYPlot plot = chart.getXYPlot();
        // XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        // renderer.setSeriesShapesVisible(0, true);
        // renderer.setSeriesShape(0, new java.awt.geom.Ellipse2D.Double(-3, -3, 6, 6));
        // renderer.setSeriesLinesVisible(0, true);
        // // renderer.setBaseToolTipGenerator(new StandardXYToolTipGenerator());
        // plot.setRenderer(renderer);

        return new ChartPanel(chart); // создает и возвращает объект ChartPanel, который отображает график chart
    }
}
