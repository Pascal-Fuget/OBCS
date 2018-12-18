curl -X POST \
  https://8E0D11FAF3F74E86B12240F4E6A98FC4.blockchain.ocp.oraclecloud.com:443/restproxy1/bcsgw/rest/v1/transaction/invocation \
  -H 'Authorization: Basic cGFzY2FsLmZ1Z2V0OkFmMjAwMzk0' \
  -H 'Content-Type: application/json' \
  -H 'Postman-Token: a0ead111-e889-468a-b306-a5a993e6662b' \
  -H 'cache-control: no-cache' \
  -d '{"channel":"partner1","chaincode":"cartrace","method":"setPartRecallState","args":["abg1234",true],"chaincodeVer":"v1"}'