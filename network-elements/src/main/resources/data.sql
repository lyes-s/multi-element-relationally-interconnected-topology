insert into network_device values ('10.133.13.12', '0', 'router');
insert into network_device values ('10.133.13.13', '0', 'server');
insert into network_device values ('10.133.13.14', '0', 'wireless router');
insert into network_device values ('10.133.13.15', '0', 'switch');
insert into network_device values ('10.133.13.16', '0', 'laptop');
insert into network_device values ('10.133.13.17', '0', 'desktop computer');
insert into network_device values ('10.133.13.18', '0', 'desktop computer');
insert into network_device values ('10.133.13.19', '0', 'desktop computer');


insert into neighbor values ('10.133.13.12');
insert into neighbor values ('10.133.13.13');
insert into neighbor values ('10.133.13.14');
insert into neighbor values ('10.133.13.15');
insert into neighbor values ('10.133.13.16');
insert into neighbor values ('10.133.13.17');
insert into neighbor values ('10.133.13.18');
insert into neighbor values ('10.133.13.19');


insert into connection values ('10.133.13.12', '10.133.13.13', '2');
insert into connection values ('10.133.13.12', '10.133.13.14', '3');
insert into connection values ('10.133.13.12', '10.133.13.15', '1');
insert into connection values ('10.133.13.14', '10.133.13.16', '5');
insert into connection values ('10.133.13.15', '10.133.13.17', '4');
insert into connection values ('10.133.13.15', '10.133.13.18', '4');
insert into connection values ('10.133.13.15', '10.133.13.19', '4');
insert into connection values ('10.133.13.17', '10.133.13.18', '0');
insert into connection values ('10.133.13.17', '10.133.13.19', '0');
insert into connection values ('10.133.13.18', '10.133.13.19', '0');