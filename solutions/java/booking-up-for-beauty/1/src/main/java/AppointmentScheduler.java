import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(appointmentDateDescription, parser);
        return dateTime;
        
        
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime current = LocalDateTime.now();
        return current.isAfter(appointmentDate);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        if(appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18){
            return true;
        } else{
            return false;
        }
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern(
            "EEEE, MMMM d, yyyy, 'at' h:mm a",
            Locale.ENGLISH
        );

        return "You have an appointment on " + appointmentDate.format(fmt) + ".";
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
}
