package com.spring.mvc.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.expression.ParseException;

import com.spring.mvc.data.OrderModel;

public class GetMaxCount {
	
	private static List<OrderModel> getOrderModel()
	{
		
		OrderModel model = new OrderModel("2024-05-21","09:30 AM");
		OrderModel model5 = new OrderModel("2024-05-21","03:30 PM");
		OrderModel model1 = new OrderModel("2024-05-21","10:00 AM");
		OrderModel model2 = new OrderModel("2024-05-22","09:30 AM");
		OrderModel model3 = new OrderModel("2024-05-23","09:30 AM");
		OrderModel model4 = new OrderModel("2024-05-22","09:30 AM");
		
		return Arrays.asList(model,model1,model2,model3,model4,model5);
	}

	
	private static String getSlot(String timeStr) throws java.text.ParseException {
       
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
            Date time = sdf.parse(timeStr);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(time);
            int hour = calendar.get(Calendar.HOUR_OF_DAY);

            if (hour >= 9 && hour < 12) {
                return "9AM-12PM";
            } else if (hour >= 14 && hour < 17) {
                return "2PM-5PM";
            } else {
                return "Other";
            }
       
    }

    public static void main(String[] args) {
        List<OrderModel> orders = getOrderModel();

        Map<String, Map<String, Long>> grouped = orders.stream()
            .collect(Collectors.groupingBy(
                OrderModel::getScheduledDate,
                Collectors.groupingBy(
                    order -> {
						try {
							return getSlot(order.getScheduledTime());
						} catch (java.text.ParseException e) {
							e.printStackTrace();
						}
						return null;
					},
                    Collectors.counting()
                )
            ));
        
        
        
System.out.println(grouped);
    }
}