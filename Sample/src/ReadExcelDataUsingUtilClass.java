
public class ReadExcelDataUsingUtilClass
{
    public static void main(String args[]) throws Exception
    {
        ExcelApiTest eat = new ExcelApiTest("D:\\SampleExcelRead.xlsx");        
        System.out.println(eat.getCellData("Data","UserName",2));
        System.out.println(eat.getCellData("Data","Password",2));
        System.out.println(eat.getCellData("Data","Date",2));
        System.out.println(eat.getCellData("Data","NumOfAttemps",2));
    }
}

