
public class Activity15 {

	public static void main(String[] args) {
		int rowNum = 0;

		for (Object[] datatype : datatypes) {
		    Row row = sheet.createRow(rowNum++);
		    int colNum = 0;
		    for (Object field : datatype) {
		        Cell cell = row.createCell(colNum++);
		        if (field instanceof String) {
		            cell.setCellValue((String) field);
		        } else if (field instanceof Integer) {
		            cell.setCellValue((Integer) field);
		        }
		    }
		}

	}

}
