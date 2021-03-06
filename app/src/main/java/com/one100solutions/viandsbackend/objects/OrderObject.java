package com.one100solutions.viandsbackend.objects;

import java.util.ArrayList;

/**
 * Created by sujith on 19/3/15.
 */
public class OrderObject {

    private String id;
    private String restaurantId;
    private String userId;
    private String time;
    private String type;

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    private long phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    private int totalAmount;

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    private boolean complete;

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    private boolean delivered;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
    private ArrayList<CartObject> items;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<CartObject> getItems() {
        return items;
    }

    public void setItems(ArrayList<CartObject> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "[" +
                "\n" + "id: " + getId() +
                "\n" + "restaurant_id: " + getRestaurantId() +
                "\n" + "user_id: " + getUserId() +
                "\n" + "time: " + getTime() +
                "\n" + "type: " + getType() +
                "\n" + "items: " + getItems() +
                "\n" + "]";
    }
}
