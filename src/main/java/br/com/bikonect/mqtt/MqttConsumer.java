package br.com.bikonect.mqtt;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;

/**
 * Created by danilopereira on 19/08/17.
 */
public class MqttConsumer {

    public MqttClient consume() throws MqttException {
        MqttClient client=new MqttClient("tcp://localhost:1883", MqttClient.generateClientId());
        SimpleMqttCallBack simpleMqttCallBack = new SimpleMqttCallBack();
        client.setCallback(simpleMqttCallBack );
        client.connect();
        return client;
//        client.subscribe("iot_data");
//        return simpleMqttCallBack.getMessage();

    }
}
