public class ReportService {
    Logger logger;
    public ReportService(Logger logger){
        this.logger = logger;
    }
    void generate(){
        // ConsoleLogger logger = new ConsoleLogger();
        logger.log("Generating daily report...");
        System.out.println("Report contents...");
    }
}