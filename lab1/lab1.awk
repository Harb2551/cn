BEGIN{ count=0;
} {
count++ }
END{
printf("Number of packets dropped is = %d\n",count);
}
