package br.ce.wcaquino.taskbackend.utils;
import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilsTest {
	
	@Test
	public void retornarTrueParaDatasFuturas() {
		LocalDate date = LocalDate.of(2034, 10, 15);
		
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
	}
	
	@Test
	public void retornarFalseParaDatasPassadas() {
		LocalDate date = LocalDate.of(2010, 12, 12);
		
		Assert.assertFalse(DateUtils.isEqualOrFutureDate(date));
	}
	
	@Test
	public void retornarTrueParaDataAtual() {
		LocalDate date = LocalDate.now();
		
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
	}
}
