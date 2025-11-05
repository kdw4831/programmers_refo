-- 코드를 입력하세요
SELECT ai.animal_id as animal_id
    ,ai.name as name
FROM animal_ins as ai 
JOIN animal_outs as ao 
ON ai.animal_id = ao.animal_id
WHERE ai.datetime > ao.datetime
ORDER BY ai.datetime 