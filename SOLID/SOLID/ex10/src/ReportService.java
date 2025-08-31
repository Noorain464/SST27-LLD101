public class ReportService {
    Logger logger;
    public ReportService(Logger logger){
        this.logger = logger;
    }
    void generate(){
        // ConsoleLogger logger = new ConsoleLogger();
        //DIP violation if we instantiate ConsoleLogger here
        logger.log("Generating daily report...");
        System.out.println("Report contents...");
    }
}