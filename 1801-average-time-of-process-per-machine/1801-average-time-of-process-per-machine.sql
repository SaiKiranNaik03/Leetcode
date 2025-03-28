# Write your MySQL query statement below
# Write your MySQL query statement below
select
    machine_id,
    round(avg(timespent),3) as processing_time 
from
    (select machine_id, max(timestamp) - min(timestamp) as timespent
    from activity
    group by machine_id, process_id) as tmp
group by
    machine_id