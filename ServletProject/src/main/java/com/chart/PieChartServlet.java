package com.chart;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import javax.servlet.ServletOutputStream;




@WebServlet("/PieChartServlet")
public class PieChartServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//데이터를 생성함
	DefaultPieDataset dataset = new DefaultPieDataset();
	dataset.setValue("Son-OGong", 63.2);
	dataset.setValue("Sa-OJumg", 37.9);
	dataset.setValue("Jer-PalGae", 29.5);
	
	//차트를 만듦 
	JFreeChart chart =ChartFactory.createPieChart("Energy Power",dataset,true,true,true);	
		
	//3. 차트를 출력 
	ServletOutputStream out = response.getOutputStream(); // 그래프 출력 
	ChartUtilities.writeChartAsPNG(out, chart, 400, 400);
		
	
	}

}
