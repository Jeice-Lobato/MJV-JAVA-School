package com.mjv.agua.luz.notificacao.util;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Formatador {

	public static String formatarCpf(String cpf) {
		String part1 = cpf.substring(0, 3);
		String part2 = cpf.substring(3, 6);
		String part3 = cpf.substring(6, 9);
		String part4 = cpf.substring(9, 11);

		String cpfFormatado = String.format("%s.%s.%s-%s", part1, part2, part3, part4);
		return cpfFormatado;
	}

	public static String formatarData(LocalDate data) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String agoraFormatado = data.format(formatter);

		return agoraFormatado;

	}

	public static String formatarCep(String cep) {
		String cep1 = cep.substring(0,2);
		String cep2 = cep.substring(2,5);
		String cep3 = cep.substring(5,8);

		String cepFormatado = String.format("%s.%s-%s", cep1,cep2,cep3);

		return(cepFormatado);

	}
	public static String formatarValor(Double valor) {
		DecimalFormat df = new DecimalFormat("#,###.00");

		String valorFormatado = df.format(valor);

		return(valorFormatado);
	}
	
	
}
