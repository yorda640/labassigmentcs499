package Exercise;

import java.time.LocalDateTime;
import java.util.List;

public class AppointmentManager {

    public static boolean checkAppointmentOverlap(List<LocalDateTime[]> appointments) {
        for (int i = 0; i < appointments.size(); i++) {
            LocalDateTime[] currentAppointment = appointments.get(i);
            LocalDateTime currentStart = currentAppointment[0];
            LocalDateTime currentEnd = currentAppointment[1];

            for (int j = i + 1; j < appointments.size(); j++) {
                LocalDateTime[] otherAppointment = appointments.get(j);
                LocalDateTime otherStart = otherAppointment[0];
                LocalDateTime otherEnd = otherAppointment[1];

                if ((currentStart.isBefore(otherEnd) || currentStart.isEqual(otherEnd))
                        && (currentEnd.isAfter(otherStart) || currentEnd.isEqual(otherStart))) {
                    return true; // Overlapping appointments found
                }
            }
        }
        return false; // No overlapping appointments found
    }

    public static void main(String[] args) {
        // Example usage
        LocalDateTime[] appointment1 = {
                LocalDateTime.of(2023, 1, 1, 10, 0),
                LocalDateTime.of(2023, 1, 1, 11, 0)
        };

        LocalDateTime[] appointment2 = {
                LocalDateTime.of(2023, 1, 1, 10, 30),
                LocalDateTime.of(2023, 1, 1, 12, 0)
        };

        LocalDateTime[] appointment3 = {
                LocalDateTime.of(2023, 1, 1, 12, 0),
                LocalDateTime.of(2023, 1, 1, 13, 0)
        };

        List<LocalDateTime[]> appointmentsList = List.of(appointment1, appointment2, appointment3);

        boolean overlap = checkAppointmentOverlap(appointmentsList);
        System.out.println("Appointments overlap: " + overlap);
    }
}

