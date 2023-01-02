package ch11;

public class MakeReport {

    StringBuffer buffer = new StringBuffer();

    private String line = "=====================================================\n";
    private String title = " name  \t\t   address  \t\t phone number  \n";
    private void makeHeader() {

      buffer.append(line);
      buffer.append(title);
      buffer.append(line);
    }

    private void generateBody() {
      
      buffer.append(" James  \t");
      buffer.append("Vancouver \t\t");
      buffer.append("123-234-1234\n");

      buffer.append(" Tomas  \t");
      buffer.append("Burnaby \t\t");
      buffer.append("321-321-4321\n");
    }

    private void makeFooter() {
      buffer.append(line);
    }

    public String getReport() {

      makeHeader();
      generateBody();
      makeFooter();
      return buffer.toString();
    }

  }
