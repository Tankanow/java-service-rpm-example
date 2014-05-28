#!/bin/bash

apt-get update
apt-get install -y rpm
apt-get install -y daemon
apt-get install -y openjdk-7-jre-headless
apt-get install -y vim-tiny

sudo rpm -e java-service-rpm-example
sudo rpm -i /vagrant/java-service-rpm-example-0.0.1-1.noarch.rpm
sudo /etc/init.d/java-service-rpm-example start
