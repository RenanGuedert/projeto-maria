package br.senai.sc.edu.projetomaria.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import br.senai.sc.edu.projetomaria.dao.CanalDao;
import br.senai.sc.edu.projetomaria.model.Canal;

public class CanalWriter {

	private String csv_name;

	public CanalWriter(String csv_name) {
		this.csv_name = csv_name;
	}

	public static void generateRelatorio(String export_path) throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd");
		Date date = new Date();
		String file_path = export_path + dateFormat.format(date).toString() + "_relatorio_canal.csv";
		
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(file_path));

				CSVPrinter csvPrinter = new CSVPrinter(writer,
						CSVFormat.DEFAULT.withHeader("ID_CANAL", "DESCRICAO"));) {
			CanalDao dao = new CanalDao();
			ArrayList<Canal> canais = new ArrayList<>();
			canais = dao.getCanais();
			for (Canal canal : canais) {
				csvPrinter.printRecord(canal.getId(), canal.getDescricao());
			}
			csvPrinter.flush();
		}
	}

}
