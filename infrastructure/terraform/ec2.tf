resource "aws_instance" "task_platform_server" {
  ami           = "ami-0d52744d6551d851e"
  instance_type = "t2.micro"

  key_name = "task-platform-key"

  subnet_id              = aws_subnet.public_subnet.id
  vpc_security_group_ids = [aws_security_group.task_platform_sg.id]

  tags = {
    Name = "task-platform-server"
  }
}
