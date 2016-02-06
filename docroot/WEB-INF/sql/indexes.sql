create index IX_BC665CEA on Event (groupId);
create index IX_D7FE67FA on Event (userId);

create index IX_9026400F on Event_Event (groupId);
create index IX_DED30C35 on Event_Event (userId);

create index IX_FF1D136A on Event_Location (groupId);

create index IX_77FB04AF on Location (groupId);