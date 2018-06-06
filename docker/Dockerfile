FROM python:3.6

WORKDIR /app

ADD . /app

# install requirements.txt packages
RUN pip3 install --trusted-host pypi.python.org -r requirements.txt

# make port 80 in container available out of container
EXPOSE 80

# environment variables
ENV NAME=world

# commands to run on launch
CMD ["python", "app.py"]