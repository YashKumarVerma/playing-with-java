```SQL
```

TRAVELLER (Id_no, Name, Address, Mobile, Occupation)
RESIDES_IN (Id_no, H_name, Date_booked)
HOTEL (H_name, Address, Landmark, Has_restaurant, Email, Phone)


Display name, address and landmark of hotels booked by maximum number of travellers in
December 2019.
```SQL
SELECT hotel.h_name, hotel.address, hotel.phone
FROM hotel
WHERE hotel.h_name IN (
    SELECT * FROM (
        (
            SELECT resides_in.h_name
            FROM resides_in
            WHERE resides_in.date_booked = 'December 2019'
            ORDER BY COUNT(*)
            LIMIT 1 
        )
    )
);
    

```

```SQL
```