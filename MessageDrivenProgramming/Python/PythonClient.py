import zmq

context = zmq.Context()

print("Connecting to the hello world server....")
socket = context.socket(zmq.REQ)
socket.connect("tcp://localhost:5555")

for i in range(10):
    print("Sending request %s ..." % i)
    socket.send(b"Hello")

    message = socket.recv()
    print("Received reply %s %s " %(i, message))
