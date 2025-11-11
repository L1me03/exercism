import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;

class AppointmentScheduler {

     public LocalDateTime schedule(String appointmentDateDescription) {
       
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime date = LocalDateTime.parse(appointmentDateDescription, parser);

        return date;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        
        return appointmentDate.isBefore(LocalDateTime.now());

        
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        
        LocalTime before = LocalTime.of(12, 00);
        LocalTime after = LocalTime.of(18,0);
       
        LocalTime currentTime = appointmentDate.toLocalTime();

        return currentTime.equals(before) || currentTime.isAfter(before) && currentTime.isBefore(after);
          
    }

    public String getDescription(LocalDateTime appointmentDate) {
             
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a");
            
        return "You have an appointment on " + appointmentDate.format(formatter) + ".";
    }

    public LocalDate getAnniversaryDate() {

        int year = LocalDate.now().getYear();

        return LocalDate.of(year, 9, 15);
        
    }
}
