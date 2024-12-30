package com.adithya.lms.services;

import com.adithya.lms.model.Borrowing;

public interface BorrowingService {

	Borrowing borrowBook(Long bookId, Long memberId);

	Borrowing returnBook(Long borrowingId);

}
