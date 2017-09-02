package br.com.bikonect.mqtt;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 * Created by danilopereira on 19/08/17.
 */
public class SimpleMqttCallBack implements MqttCallback {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void connectionLost(Throwable throwable) {
        System.out.println("Connection to MQTT Broker lost!");
    }

    public void messageArrived(String s, MqttMessage mqttMessage) throws Exception {
        System.out.println("Message received:\n\t"+new String(mqttMessage.getPayload()));
    }

    public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {

    }
}
