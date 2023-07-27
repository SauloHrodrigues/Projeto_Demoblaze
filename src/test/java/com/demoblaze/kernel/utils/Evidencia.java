package com.demoblaze.kernel.utils;

import static com.demoblaze.kernel.Contexto.getDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.demoblaze.kernel.Contexto;

import cucumber.api.Scenario;

public class Evidencia  {

	public void capturarTela(Scenario sc) {
		LocalDateTime data = LocalDateTime.now();
		int dd = data.getDayOfMonth();
		int MM = data.getMonthValue();
		int aaaa = data.getYear();
		int hh =data.getHour();
		int mm = data.getMinute();
		int ss = data.getSecond();
		String status, pasta;
		String tag = Contexto.getIdCenario();
		TakesScreenshot screen = (TakesScreenshot) getDriver();
		File evidencias= screen.getScreenshotAs(OutputType.FILE);
		
		if(sc.isFailed()) {
			status="FALHOU";
			pasta = "falha";
			
		}else {		
			status ="PASSOU";
			pasta = "sucesso";
		}
		
		try {
			FileUtils.copyFile(evidencias, new File(
					"evidencias"+File.separator+
					pasta+File.separator+"ID"+"_"+tag+"_"+status+"_"+dd+"_"+MM+"_"+aaaa+
					"_"+hh+"_"+mm+"_"+ss+".jpg"));
		} catch (IOException e) {
			System.out.println("Pasta \" "+pasta+" \" não encontrada! ");
			e.printStackTrace();
		}		
	}
}