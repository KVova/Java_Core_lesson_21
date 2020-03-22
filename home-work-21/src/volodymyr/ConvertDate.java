package volodymyr;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class ConvertDate {

	public static void main(String[] args) {

		Date todayDate = new Date();
        		
		ZoneId defaultZoneId = ZoneId.systemDefault();
	    System.out.println("System Default TimeZone : " + defaultZoneId);
		
		Date date = new Date();
        System.out.println("date : " + date);
        
        //1. Convert Date -> Instant
        Instant instant = date.toInstant();
        System.out.println("instant : " + instant); //Zone : UTC+0

        //2. Instant + system default time zone + toLocalDate() = LocalDate
        LocalDate localDate = instant.atZone(defaultZoneId).toLocalDate();
        System.out.println("localDate : " + localDate);

        //3. Instant + system default time zone + toLocalDateTime() = LocalDateTime
        LocalDateTime localDateTime = instant.atZone(defaultZoneId).toLocalDateTime();
        System.out.println("localDateTime : " + localDateTime);

        //4. Instant + system default time zone = ZonedDateTime
        ZonedDateTime zonedDateTime = instant.atZone(defaultZoneId);
        System.out.println("zonedDateTime : " + zonedDateTime);		

	}
//	
//	public LocalDate convertToLocalDateViaSqlDate(Date dateToConvert) {
//	    return new java.sql.Date(dateToConvert.getTime()).toLocalDate();
//	}
	
}

