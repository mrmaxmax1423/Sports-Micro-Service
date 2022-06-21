INSERT INTO PLAYER (id,firstName, lastName, hometown, dob, teamPlayingFor, sport) values
(1,'Chris', 'Johannemann', 'Union, KY', '10-03-1986', 'Cincinnati Reds', 'baseball'),
(2,'Joe', 'Dimagio', 'Union, KY', '10-03-1985', 'Cincinnati Reds', 'baseball'),
(3,'Hank', 'Aaron', 'Union, KY', '10-03-1984', 'Cincinnati Reds', 'baseball'),
(4,'Katie', 'Johannemann', 'Union, KY', '10-03-1983', 'Cincinnati Reds', 'baseball');

(5, 'Cooper', 'Johnson', 'Cleves, OH', '10-03-1986', 'Cincinnati Bengals', 'football');
(6, 'Steve', 'Smith', 'Chicago, IL', '10-03-1985', 'Cincinnati Bengals', 'football');
(7, 'Dave', 'Mills', 'Destin, FL', '10-03-1984', 'Cincinnati Bengals', 'football');
(8, 'Zion', 'Taylor', 'Scranton, DE', '10-03-1983', 'Cincinnati Bengals', 'football');

(9, 'Tyreek', 'Thorn', 'Cincinnati, OH', '10-03-1986', 'FC Cincinnati', 'soccer');
(10,'Solomon', 'Daria', 'Cincinnati, OH', '10-03-1985', 'FC Cincinnati', 'soccer');
(11,'Tanner', 'Miller', 'Cincinnati, OH', '10-03-1984', 'FC Cincinnati', 'soccer');
(12,'Luke', 'Jenner', 'Cincinnati, OH', '10-03-1983', 'FC Cincinnati', 'soccer');

Insert into MLB (sport, team, wins, losses, nextGame) values
('Baseball', 'Cincinnati Reds', '8', '25', '05-25-2022'),
('Baseball', 'Cincinnati Reds', '8', '25', '05-26-2022');

Insert into NFL (sport, team, wins, losses, nextGame) values
('Football', 'Cincinnati Bengals', '7', '2', '09-30-2023'),
('Football', 'Cincinnati Bengals', '7', '2', '09-30-2023');

Insert into MLS (sport, team, wins, ties, losses, nextGame) values
('Soccer', 'FC Cincinnati', '9','0','4', '07-21-2023'),
('Soccer', 'FC Cincinnati', '9','0','4', '07-21-2023');
