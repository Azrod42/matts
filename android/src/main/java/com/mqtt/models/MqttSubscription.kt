package com.mqtt.models

data class MqttSubscription(
  val topic: String,
  val qos: QoS
)
