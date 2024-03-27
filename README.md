running of Docker in the server 

Steps to Run docker conatainer  

Docker file is there in our repo

STEPS:

sudo apt update

sudo apt install docker.io

sudo systemctl start docker

sudo systemctl enable docker

sudo systemct status docker

docker build -t <imagename> .

docker images (To check whether the image is created or not)

docker ps -a ( to check conatiner status)

docker start <Container Id>

docker run -it -d -p 5000:5000 <Image name>

