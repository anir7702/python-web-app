running of Docker in the server 

Steps to Run docker conatainer  

Docker file is there in our repo

STEPS:

sudo apt update

sudo apt install docker.io

sudo systemctl start docker

sudo systemctl enable docker

sudo systemct status docker

sudo docker build -t <imagename> .

sudo docker images (To check whether the image is created or not)

sudo docker ps -a ( to check conatiner status)

sudo docker start <Container Id>

sudo docker run -it -d -p 5000:5000 <image_name>


