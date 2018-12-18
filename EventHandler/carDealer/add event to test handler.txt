curl -X POST \
  https://obcseventhandler-gse00014212.uscom-east-1.oraclecloud.com/myapp/recallEvents/add \
  -H 'Content-Type: application/json' \
  -H 'Postman-Token: 8c0d3dee-6d98-4f81-89dd-ab1836788180' \
  -H 'cache-control: no-cache' \
  -d '{
  "eventType": "chaincodeEvent",
  "subid": "75d8cc12-7673-4712-ba42-715adb69e6b1",
  "channel": "ch1",
  "eventMsg": {
    "chaincodeId": "cc1",
    "txId": "50b4852d5e659080445f896a495cf0200b3f651f5e7cc61c7bff5d7fd3223005",
    "eventName": "evtsender1",
    "payload": {
      "type": "UTF-8",
      "data": "Event for test"
    }
  }
}
'