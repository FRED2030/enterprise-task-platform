resource "aws_subnet" "public_subnet" {
  vpc_id                  = aws_vpc.task_platform_vpc.id
  cidr_block             = "10.10.1.0/24"
  map_public_ip_on_launch = true

  tags = {
    Name = "task-platform-public-subnet"
  }
}
